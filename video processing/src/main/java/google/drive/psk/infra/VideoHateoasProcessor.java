package google.drive.psk.infra;
import google.drive.psk.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class VideoHateoasProcessor implements RepresentationModelProcessor<EntityModel<Video>>  {

    @Override
    public EntityModel<Video> process(EntityModel<Video> model) {

        
        return model;
    }
    
}
