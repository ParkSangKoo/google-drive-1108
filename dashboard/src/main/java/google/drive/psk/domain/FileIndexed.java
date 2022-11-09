package google.drive.psk.domain;

import google.drive.psk.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
