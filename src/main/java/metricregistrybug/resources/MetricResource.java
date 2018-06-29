
package metricregistrybug.resources;

import com.codahale.metrics.MetricRegistry;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Carter McKinnon {@literal <carter.mckinnon@darkowl.com>}
 */
@Path("/metrics")
public class MetricResource
{
    private final MetricRegistry metrics;
    
    public MetricResource( MetricRegistry metrics )
    {
        this.metrics = metrics;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MetricRegistry get()
    {
        return metrics;
    }

}
