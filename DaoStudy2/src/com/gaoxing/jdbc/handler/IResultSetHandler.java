package com.gaoxing.jdbc.handler;

import java.sql.ResultSet;
import java.util.List;

public interface IResultSetHandler<T> {
	T handle(ResultSet res) throws Exception;
}
