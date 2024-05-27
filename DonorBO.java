import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
class DonorBO {
	private Map<String,String>  donorMap = new TreeMap<>();
	public void addDonor(String donorName, String bloodGroup) {
		donorMap.put(donorName, bloodGroup);
	}
	public List<String> findDonorsByBloodGroup(String bloodGroup) {
		List<String> donors = new ArrayList<>();
		for (Map.Entry<String, String> entry : donorMap.entrySet()) {
			if(entry.getValue().equals(bloodGroup)) {
				donors.add(entry.getKey());
			}
		}
		return donors;
	}
	public List<String> getBloodGroups() {
		Set<String> bloodGroupsSet = new TreeSet<> (donorMap.values());
		return new ArrayList<>(bloodGroupsSet);
	}
	public Map<String, String> getDonorMap() { 
		return donorMap;
	}
	public void setDonorMap(Map<String, String> donorMap) {
		this.donorMap = donorMap;
	}
}
	 	  	  	 		  	     	      	 	
