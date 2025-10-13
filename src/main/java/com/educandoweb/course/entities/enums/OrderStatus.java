package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3),  DELIVERED(4), CANCELAD(5);

	//codigo do tipo enumerado exemplo:1
	private int code;

	//construtor
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//metodo pra tornar o construtor com acesso publico
	public int getCode() {
		return code;
	}
	
	//percorre os tipos enumerados
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}

}
