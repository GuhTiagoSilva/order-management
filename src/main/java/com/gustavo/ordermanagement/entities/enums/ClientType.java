package com.gustavo.ordermanagement.entities.enums;

public enum ClientType {

	PHYSICALPERSON(1, "PHYSICAL PERSON"), LEGALPERSON(2, "LEGAL PERSON");

	private Integer code;
	private String description;

	private ClientType(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static ClientType toEnum(Integer code) {
		
		if (code == null) {
			return null;
		}

		for (ClientType type : ClientType.values()) {
			if (code.equals(type.getCode())) {
				return type;
			}
		}

		throw new IllegalArgumentException("Invalid code: " + code);
	}
}
