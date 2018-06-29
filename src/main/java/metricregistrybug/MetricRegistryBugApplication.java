
package metricregistrybug;

import metricregistrybug.resources.MetricResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 *
 * @author Carter McKinnon {@literal <carter.mckinnon@darkowl.com>}
 */
public class MetricRegistryBugApplication extends Application<Configuration>
{
    public static void main( String[] args ) throws Exception
    {
        new MetricRegistryBugApplication().run( "server" );
    }
    
    @Override
    public void run( Configuration t, Environment e ) throws Exception
    {
        e.jersey().register( new MetricResource( e.metrics() ));
    }
}