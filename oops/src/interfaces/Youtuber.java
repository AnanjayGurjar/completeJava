package interfaces;

public abstract interface Youtuber {
	
	public abstract void makeVideo();
	
	default void uploadVideo() {					//by using a default keyword we can add body to our method in interface which otherwise is not possible 
		System.out.println("Youtuber is uploading a video");
	}
		
	

}
