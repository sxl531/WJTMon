package com.WJTMon.service.impl;

import com.WJTMon.dao.AccountInfoMapper;
import com.WJTMon.entity.AccountInfo;
import com.WJTMon.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountInfoMapper accountInfoMapper;

    @Override
    public String addAccountInfo(AccountInfo accountInfo) {

        return null;
    }
}
