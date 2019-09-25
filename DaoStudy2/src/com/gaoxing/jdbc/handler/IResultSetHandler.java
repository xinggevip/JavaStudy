package com.gaoxing.jdbc.handler;

import java.sql.ResultSet;
import java.util.List;

public interface IResultSetHandler {
	List handle(ResultSet res) throws Exception;
}
