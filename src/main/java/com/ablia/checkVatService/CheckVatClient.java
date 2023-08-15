package com.ablia.checkVatService;

import java.sql.Date;

import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.holders.DateHolder;

import checkVat.services.vies.taxud.eu.europa.ec.CheckVatPortTypeProxy;

public class CheckVatClient {
	// static checkVat.services.vies.taxud.eu.europa.ec.CheckVatService service;
	private String name;
	private String address;
	private String vatNumber;
	private String countryCode;
	private Date requestDate;
	private boolean valid;

	public CheckVatClient(String countryCode, String vatNumber) {

		BooleanHolder validSH = new BooleanHolder();
		DateHolder requestDateSH = new DateHolder();
		StringHolder countryCodeSH = new StringHolder(countryCode);
		StringHolder vatNumberSH = new StringHolder(vatNumber);
		StringHolder nameSH = new StringHolder();
		StringHolder addressSH = new StringHolder();

		CheckVatPortTypeProxy service = new CheckVatPortTypeProxy();
		try {

			service.checkVat(countryCodeSH, vatNumberSH, requestDateSH,
					validSH, nameSH, addressSH);

			setAddress(addressSH.value);
			setName(nameSH.value);
			setValid(validSH.value);
			setRequestDate(new Date(requestDateSH.value.getTime()));
			setCountryCode(countryCode);
			setVatNumber(vatNumber);
		} catch (Exception e) {
		}
	}

	public String getName() {
		return name == null ? "" : name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address == null ? "" : address.trim();
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVatNumber() {
		return vatNumber == null ? "" : vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getCountryCode() {
		return countryCode == null ? "" : countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public boolean getValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
}