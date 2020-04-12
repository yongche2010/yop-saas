package com.yongche.yopsaas.db.service;

import com.github.pagehelper.PageHelper;
import com.yongche.yopsaas.db.dao.YopsaasSearchHistoryMapper;
import com.yongche.yopsaas.db.domain.YopsaasSearchHistory;
import com.yongche.yopsaas.db.domain.YopsaasSearchHistoryExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class YopsaasSearchHistoryService {
    @Resource
    private YopsaasSearchHistoryMapper searchHistoryMapper;

    public void save(YopsaasSearchHistory searchHistory) {
        searchHistory.setAddTime(LocalDateTime.now());
        searchHistory.setUpdateTime(LocalDateTime.now());
        searchHistoryMapper.insertSelective(searchHistory);
    }

    public List<YopsaasSearchHistory> queryByUid(int uid) {
        YopsaasSearchHistoryExample example = new YopsaasSearchHistoryExample();
        example.or().andUserIdEqualTo(uid).andDeletedEqualTo(false);
        example.setDistinct(true);
        return searchHistoryMapper.selectByExampleSelective(example, YopsaasSearchHistory.Column.keyword);
    }

    public void deleteByUid(int uid) {
        YopsaasSearchHistoryExample example = new YopsaasSearchHistoryExample();
        example.or().andUserIdEqualTo(uid);
        searchHistoryMapper.logicalDeleteByExample(example);
    }

    public List<YopsaasSearchHistory> querySelective(String userId, String keyword, Integer page, Integer size, String sort, String order) {
        YopsaasSearchHistoryExample example = new YopsaasSearchHistoryExample();
        YopsaasSearchHistoryExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(userId)) {
            criteria.andUserIdEqualTo(Integer.valueOf(userId));
        }
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return searchHistoryMapper.selectByExample(example);
    }
}
