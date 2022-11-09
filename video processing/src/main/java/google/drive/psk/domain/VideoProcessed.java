package google.drive.psk.domain;

import google.drive.psk.domain.*;
import google.drive.psk.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
