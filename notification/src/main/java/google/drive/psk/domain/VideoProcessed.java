package google.drive.psk.domain;

import google.drive.psk.domain.*;
import google.drive.psk.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}


