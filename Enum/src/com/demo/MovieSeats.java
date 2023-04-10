package com.demo;

enum MovieSeats {
	
    STANDARD(300), PREMIUM(400), RECLINER(550);
	
    int price;
	MovieSeats(int price) { // internally private
      
		this.price=price;
     
	}

}

