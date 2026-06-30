package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST
 * NORMAL
 * SLOW
 */
@Data
@AllArgsConstructor
public class DeliveryCode {
    private String deliveryCode;
    private String displayName;
}
