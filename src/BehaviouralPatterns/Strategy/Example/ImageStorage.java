package BehaviouralPatterns.Strategy.Example;

public class ImageStorage {
	private Compressor compressor;
	private Filter filter;

	public void StoreImage(){
		System.out.println("started compressing");
		compressor.StartCompress();
		System.out.println("started applying filter");
		filter.ApplyFilter();
	}

	public ImageStorage(Compressor compressor, Filter filter) {
		this.compressor = compressor;
		this.filter = filter;
	}
}
