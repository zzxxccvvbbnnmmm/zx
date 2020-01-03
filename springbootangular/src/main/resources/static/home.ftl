<html>
<head>
    <title>SpringBoot-angualar实例</title>
    <style>
        .empName.ng-valid {
            background-color: lightgreen;
        }
        .empName.ng-dirty.ng-invalid-required {
            background-color: red;
        }
        .empName.ng-dirty.ng-invalid-minlength {
            background-color: yellow;
        }

        .email.ng-valid {
            background-color: lightgreen;
        }
        .email.ng-dirty.ng-invalid-required {
            background-color: red;
        }
        .email.ng-dirty.ng-invalid-email {
            background-color: yellow;
        }
    </style>
    <link rel="stylesheet" href="aa/css/bootstrap.min.css">
    <link href="aa/css/app.css" rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
<div class="generic-container" ng-controller="EmpController as ctrl">
    <div class="panel panel-primary">
        <div class="panel-heading"><span class="lead">SpringBoot整合AngularJS</span></div>
        <div class="formcontainer">
            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                <input type="hidden" ng-model="ctrl.emp.empId" />
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-2 control-lable" >empName</label>
                        <div class="col-md-7">
                            <input type="text" ng-model="ctrl.emp.empName" name="empName" class="form-control input-sm" placeholder="Enter your name" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-2 control-lable" >gender</label>
                        <div class="col-md-7">
                            <input type="text" ng-model="ctrl.emp.gender" name="gender" class="form-control input-sm" placeholder="Enter your Gender" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-2 control-lable" >email</label>
                        <div class="col-md-7">
                            <input type="email" ng-model="ctrl.emp.email" name="email" class="form-control input-sm" placeholder="Enter your Email" required/>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit"  value="{{!ctrl.emp.empId ? '添加' : '修改'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="panel panel-primary">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">员工列表</span></div>
        <div class="formcontainer">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>empId</th>
                    <th>empName</th>
                    <th>gender</th>
                    <th>email</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="e in ctrl.emps">
                    <td><span ng-bind="e.empId"></span></td>
                    <td><span ng-bind="e.empName"></span></td>
                    <td><span ng-bind="e.gender"></span></td>
                    <td><span ng-bind="e.email"></span></td>
                    <td>
                        <button type="button" ng-click="ctrl.edit(e.empId)" class="btn btn-success btn-xs">修改</button>
                        <button type="button" ng-click="ctrl.remove(e.empId)" class="btn btn-danger btn-xs">删除</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript" src="/cms/js/angular.js"></script>
<script type="text/javascript" src="/cms/js/app.js"></script>
<script type="text/javascript" src="/cms/js/service/empService.js"></script>
<script type="text/javascript" src="/cms/js/controller/empController.js"></script>
</body>
</html>
