package com.test.question.q92;

//Ctrl + Shift + F

class Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		
		if(title.length()>50) {
			return;
		}
		for(int i=0; i<title.length(); i++) {
			char c = title.charAt(i);
			if((c<'가'||c>'힣')&&(c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'0'||c>'9')&&c!=' ') {
				return;
			}
		}
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if(price<0 || price>1000000) {
			return;
		}
		
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		
		if(page<1) {
			return;
		}
		this.page = page;
	}

	public String getPubYear() { //읽기전용
		return pubYear;
	}

	public void setPublisher(String publisher) { //쓰기전용
		this.publisher = publisher;
	}
	
	   public String info() {
	         return String.format("제목: %s\r\n"
	        		 			  +"가격: %,d원\r\n"
	        		 			  +"저자: %s\r\n"
	        		 			  +"출판사: %s\r\n"
	        		 			  +"발행년도: %s\r\n"
	        		 			  +"ISBN: %s\r\n"
	        		 			  +"페이지: %,d장"
	        		 			  ,this.title
	        		 			  ,this.price
	        		 			  ,this.author
	        		 			  ,this.publisher
	        		 			  ,this.pubYear
	        		 			  ,this.isbn
	        		 			  ,this.page);
	   }

	
	
	
	
}//class











