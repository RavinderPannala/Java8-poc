package com.java8.features.Utils;

import java.util.Optional;

public class Address {

	private Optional<String> addressText;
	
	private Optional<Long> contactNumber;

	public Address(String address, long contactNumber) {
		this.addressText = Optional.ofNullable(address);
		this.contactNumber = Optional.ofNullable(contactNumber);
	}

	public Optional<String> getAddressText() {
		return addressText;
	}

	public void setAddressText(Optional<String> addressText) {
		this.addressText = addressText;
	}

	public Optional<Long> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Optional<Long> contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Address{" +
				"addressText=" + addressText +
				", contactNumber=" + contactNumber +
				'}';
	}
}
