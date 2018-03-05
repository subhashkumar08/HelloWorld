package com.accelya.product.cargo.ss;

import com.mercator.framework.mservice.api.APIMService;
import com.mercator.framework.mservice.stereotypes.Id;
import com.mercator.framework.mservice.stereotypes.Path;
import com.mercator.framework.mservice.stereotypes.SelfService;


/**
 * The Class CodeSS.
 *
 * @author S00356
 */
@SelfService(
        id = @Id(name = "ULDTypesSS", version = "1.0"),
        path = @Path("/cargo/reference-data/storage-unit-types/uldtypes")
)
public class ULDTypesSS extends APIMService {
}
