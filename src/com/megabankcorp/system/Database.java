package com.megabankcorp.system;

import com.megabankcorp.records.Account;

import javax.security.auth.login.AccountException;
import java.math.BigDecimal;

public abstract class Database {


    public abstract void saveSum(BigDecimal sum, Account currentAccount);
    public abstract void withdraw (BigDecimal sum, Account currentAccount);
    protected abstract void getAmount (BigDecimal sum, Account currentAccount);
    protected abstract void transfer (BigDecimal sum, Account account1, Account clientAccount);



}
