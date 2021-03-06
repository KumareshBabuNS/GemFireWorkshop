package io.pivotal.app.query;

import io.pivotal.app.domain.Employee;

import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.ClientCache;
import com.gemstone.gemfire.cache.client.ClientCacheFactory;

public class QueryAllEmployees
{
    private ClientCache cache = null;
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    public QueryAllEmployees()
    {
        ClientCacheFactory ccf = new ClientCacheFactory();
        ccf.set("cache-xml-file", "config/query-client.xml");
        cache = ccf.create();
    }

    public void run() throws Exception
    {
        Region<String,Employee> employees = cache.getRegion("employees");

        Set<String> keysOnServer = employees.keySetOnServer();

        logger.log (Level.INFO, "\nEmployees size:\n\t" + keysOnServer.size());

        Map<String, Employee> countriesMap = employees.getAll(keysOnServer);
        Set<Map.Entry<String, Employee>> entries = countriesMap.entrySet();

        for (Map.Entry<String,Employee> entry: entries)
        {
            System.out.println(
                    String.format("Key %s, Value %s", entry.getKey(), entry.getValue()));
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        QueryAllEmployees test = new QueryAllEmployees();

        try
        {
            test.run();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
