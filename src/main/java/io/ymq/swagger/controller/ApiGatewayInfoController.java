package io.ymq.swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.ymq.swagger.model.ObjectWriterTest.Zoo;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/gateway-conf")
@Api(value = "ApiGatewayInfoController 测试", description = "RESTful API")
public class ApiGatewayInfoController {

	
	@ApiOperation(value = "获取api网关信息")
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public Zoo getGatewayInfo3() {

		BigInteger bi = new BigInteger("999999999999999889");
		Zoo z = new Zoo(bi,"abc");

		return z;
	}
	@ApiOperation(value = "获取api网关信息")
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public BigInteger getGatewayInfo4() {

		BigInteger bi = new BigInteger("999999999999999889");

		return bi;
	}
	
	@ApiOperation(value = "获取api网关信息")
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public BigDecimal getGatewayInfo5() {

		BigDecimal  bi = new BigDecimal ("999999999999999889");

		return bi;
	}
}
