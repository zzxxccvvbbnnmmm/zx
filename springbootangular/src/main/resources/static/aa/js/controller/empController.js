/*'use strict';*/

App.controller('EmpController', ['$scope', 'EmpService', function($scope, EmpService) {
    var self = this;
    self.employee={id:null,empname:'',gender:'',email:'',did:''};
    self.employees=[];

    self.fetchAllEmps = function(){
        EmpService.fetchAllEmps()
            .then(
                function(d) {
                    self.employees = d;
                },
                function(errResponse){
                    console.error('Error while fetching Currencies');
                }
            );
    };

    self.createEmp = function(employee){
        EmpService.createEmp(employee)
            .then(
                self.fetchAllEmps,
                function(errResponse){
                    console.error('Error while creating Emp.');
                }
            );
    };

    self.updateEmp = function(employee){
        EmpService.updateEmp(employee)
            .then(
                self.fetchAllEmps,
                function(errResponse){
                    console.error('Error while updating Emp.');
                }
            );
    };

    self.deleteEmp = function(empId){
        EmpService.deleteEmp(empId)
            .then(
                self.fetchAllEmps,
                function(errResponse){
                    console.error('Error while deleting Emp.');
                }
            );
    };

    self.fetchAllEmps();

    self.submit = function() {
        if(self.employee.id==null){
            self.createEmp(self.employee);
        }else{
            self.updateEmp(self.employee);
        }
        self.reset();
    };

    self.edit = function(id){
        for(var i = 0; i < self.employees.length; i++){
            if(self.employees[i].id == id) {
                self.employee = angular.copy(self.employees[i]);
                break;
            }
        }
    };

    self.remove = function(id){
        for(var i = 0; i < self.employees.length; i++){
            if(self.employees[i].id == id) {
                self.reset();
                break;
            }
        }
        self.deleteEmp(id);
    };


    self.reset = function(){
        self.employee={id:null,empname:'',gender:'',email:'',did:""};
        $scope.myForm.$setPristine(); //reset Form $setPristine 回到原始状态
    };

}]);
