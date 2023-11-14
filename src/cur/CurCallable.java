package cur;

import java.util.List;

public interface CurCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
