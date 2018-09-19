package com.WJTMon.service;

import com.WJTMon.entity.AccountInfo;

public interface IAccountService {

    /**
     * 添加账号信息
     * @param accountInfo
     * @return
     */
    String addAccountInfo(AccountInfo accountInfo);
}
