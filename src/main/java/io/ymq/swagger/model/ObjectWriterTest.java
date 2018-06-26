package io.ymq.swagger.model;

import java.io.Serializable;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 * @author 李小飞
 * @date 创建时间：2018年6月26日 上午9:39:09 
 * @version 1.0 
 * @parameter 
 * @since  JDK8
 * @return  
 */
public class ObjectWriterTest {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		BigInteger bi = new BigInteger("9999999999999999");
		try {
			String jsonInString = mapper.writeValueAsString(bi);
			System.out.println(jsonInString);
			Zoo z = new Zoo(bi,"abc");
			jsonInString = mapper.writeValueAsString(z);
			System.out.println(jsonInString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static class Zoo implements Serializable{
		
		private BigInteger bi;
		
		public BigInteger getBi() {
			return bi;
		}
		public void setBi(BigInteger bi) {
			this.bi = bi;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
		public Zoo(BigInteger bi,String name){
			this.bi=bi;
			this.name=name;
		}
	}
}
