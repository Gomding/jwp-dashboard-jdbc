package nextstep.jdbc.parametervalue;

import nextstep.jdbc.exception.ParameterSetIncorrectlyException;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IntegerParameterValue extends ParameterValue {

    public IntegerParameterValue(Object value) {
        super(value);
    }

    @Override
    public void setPreparedStatementParameter(int parameterIndex, PreparedStatement preparedStatement) {
        try {
            preparedStatement.setInt(parameterIndex, (Integer) getValue());
        } catch (SQLException e) {
            throw new ParameterSetIncorrectlyException("Parameter Index : " + parameterIndex + ", Set Integer Value Failed!!", e);
        }
    }
}