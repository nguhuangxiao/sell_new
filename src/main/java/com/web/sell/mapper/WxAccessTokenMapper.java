package com.web.sell.mapper;

import com.web.sell.model.WxAccessToken;

public interface WxAccessTokenMapper {

    int insert(WxAccessToken record);

    WxAccessToken selectByPrimaryKey(Long gid);

    WxAccessToken findLatest();

}
