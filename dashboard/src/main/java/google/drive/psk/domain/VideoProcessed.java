package google.drive.psk.domain;

import google.drive.psk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}
