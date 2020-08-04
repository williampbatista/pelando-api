package br.com.tarz.pelandoapi.responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	private List<T> data;
	private List<String> errors;

	public List<T> getData() {
		if(data == null) return new ArrayList<T>();
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public Response() {
	}
}