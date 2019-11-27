package Service;
import operation.OperationType;
import org.springframework.stereotype.Service;
@Service
public class CalculationService {

    public int add(OperationType model){
        return model.getA() + model.getB();
    }

    public int multiply(OperationType model){
        return model.getA() * model.getB();
    }

    public double divide(OperationType model){
        if(model.getA() == 0) return 0;
        if(model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }
}
