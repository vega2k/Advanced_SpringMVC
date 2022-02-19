package hello.itemservice.domain.lang;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * en : 영어
 * ko : 한국어
 */
@Data
@AllArgsConstructor
public class LanguageCode {

    private String code;
    private String displayName;

}
