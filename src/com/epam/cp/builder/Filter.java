package com.epam.cp.builder;

public class Filter {
	
	private final String name;
	private int min;
	private int max;
	
	public Filter(String name) {
		this.name = name;
	}
	
	private Filter(FilterBuilder builder) {
		this.min = builder.getMin();
		this.max = builder.getMax();
		this.name = builder.getName();
	}
	
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public static class FilterBuilder {

		private String name;
		private int min;
		private int max;

		public int getMin() {
			return min;
		}
		
		public int getMax() {
			return max;
		}
		
		public String getName() {
			return name;
		}
		
		public FilterBuilder min(int min) {
			this.min = min;
			return this;
		}

		public FilterBuilder max(int max) {
			this.max = max;
			return this;
		}
		
		public FilterBuilder name(String name) {
			this.name = name;
			return this;
		}

		public Filter build() {
			return new Filter(this);
		}

	}

	@Override
	public String toString() {
		return "Filter: " 
				+ "name:[" + this.getName() + "], "
				+ "min:[" + this.getMin() + "], "
				+ "max:[" + this.getMax() + "];";
	}
}
