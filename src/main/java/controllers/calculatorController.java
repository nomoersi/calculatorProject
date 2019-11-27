package controllers;

import operation.OperationType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class calculatorController {

    OperationType operationType = new OperationType();

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculator";


}
