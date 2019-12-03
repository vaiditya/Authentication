package app.pages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClass  {
	@Autowired
	private DemoRepository repository;

		public List<Hierarchy> getDetails(){
			return repository.findAll();
		}
		
		public Hierarchy getDetailbyId(String id){
			return repository.findByPassword(id);
		}

		public Hierarchy postDetails(Hierarchy data){
			repository.save(data);
			return data;
		}


		public void deleteDetail(String id){
			repository.deleteById(id);
		}

		public List<Hierarchy> findByNameContaining(String name){

//			return Arrays.asList(new Hierarchy("11","user","pass"));
				return	repository.findByUserNameContaining(name);
		}

}
