public class Server {

	public int sID;
	public String type;
	public int limit;
	public int bootupTime;
	public float hourlyRate;
	public int coreCount;
	public int memory;
	public int disk;
	public int sState;
	public int sAvailableTime;

	Server(int sID, String type, int limit, int bootupTime, float hourlyRate, int coreCount, int memory, int disk) {
		this.sID = sID;
		this.type = type;
		this.limit = limit;
		this.bootupTime = bootupTime;
		this.hourlyRate = hourlyRate;
		this.coreCount = coreCount;
		this.memory = memory;
		this.disk = disk;
	}

	Server(String type, int sID, int sState, int sAvailableTime, int coreCount, int memory, int disk) {
		this.type = type;
		this.sID = sID;
		this.sState = sState;
		this.sAvailableTime = sAvailableTime;
		this.coreCount = coreCount;
		this.memory = memory;
		this.disk = disk;
	}
}