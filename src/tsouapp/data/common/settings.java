package tsouapp.data.common;

import tsouapp.data.dbConnection;

/**
 * Created by alxga on 25.10.2016.
 */
public class settings {

    public dbConnection con = (dbConnection) new dbConnection().getConnection();

    public settings(){


    }
}
