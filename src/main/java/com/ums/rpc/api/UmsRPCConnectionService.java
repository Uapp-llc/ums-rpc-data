package com.lectera.rpc.api;

import com.lectera.rpc.data.CreditedAccrualDto;
import com.lectera.rpc.data.TokensDto;
import com.lectera.rpc.data.UserDto;

public interface UmsRPCConnectionService {
	Boolean addAccrualAmountToWallet(CreditedAccrualDto accrual);
	Boolean isOrderPaid(String orderUuid);
	TokensDto setBaseUserRole(String productApiKey, String userUuid, String role);
	UserDto getUserProfileData(String userUuid);
}
