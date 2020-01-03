/*'use strict';*/
//自定义服务
App.service('EmpService', ['$http', '$q', function ($http, $q) {

    return {

        fetchAllEmps: function () {
            return $http.get('http://localhost:8080/queryListEmp')
                .then(function (result) {  //正确请求成功时处理

                    var data = result.data;
                    if(data.succecc==200){
                        console.log(data)
                       return data.data;
                    }
                }).catch(function (result) { //捕捉错误处理
                    console.info(result);
                    alert(result.data.msg);
                });

        },

        createEmp: function (employee) {
          return $http.post('http://localhost:8080/addEmp', employee)
                .then(
                    function (response) {
                        return response.data.data;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );

        },

        updateEmp: function (employee) {
            return $http.post('http://localhost:8080/updateEmp', employee)
                .then(
                    function (response) {
                        return response.data.data;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );


        },

        deleteEmp: function (id) {
            return $http.post('http://localhost:8080/deleteEmp',id)
                .then(
                    function (response) {
                        return response.data.msg;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );
        }

    };

}]);
