<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Library Page</title>
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">
    <script src="../resources/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container border border-dark border-3">
    <div class="row">
        <div class="col col-9">
            <div class="bg-light mt-2 p-2 text-center">
                <h1>Library Management</h1>
            </div>
        </div>
        <div class="col">
            <div class="d-flex justify-content-start bg-light mt-2 p-3">
                Welcome<h5>&nbsp;${username}</h5>
            </div>
            <div class="d-flex justify-content-end bg-light" style="margin-top: -16%;">
                <form action="Logout" method="GET">
                    <input class="btn btn-dark" type="submit" value="Logout">
                </form>
            </div>
        </div>
    </div>
    <div class="row border border-dark border-3">
        <div class="row">
            <div class="col">
                <div class="mt-2 p-1 text-center">
                    <h1>Add Book Details</h1>
                </div>
            </div>
            <form action="Add" method="POST" id="nameForm">
                <div class="shadow-lg">
                    <div class="accordion-item row-cols-3">
                        <label for="bookCodeField">Book Code :: </label>
                        <input class="accordion-body" name="bookCode" id="bookCodeField" placeholder="Enter Book Code">
                    </div>
                    <div class="accordion-item row-cols-3">
                        <label for="bookNameField">Book Name :: </label>
                        <input class="accordion-body" name="bookName" id="bookNameField" placeholder="Enter Book Name">
                    </div>
                    <div class="accordion-item row-cols-3 d-flex d-inline">
                        <label class="mt-3" for="bookNameField">Select Author :: </label>
                        <select class="form-select accordion-body" id = "bookAuthor" name="bookAuthor"
                                aria-label="Default select example" style="width: 33.8%;">
                            <c:forEach var="auth" items="${authors}">
                            <option label="${auth.authorName}" value="${auth.authorName}">${auth.authorName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="accordion-item row-cols-3">
                        <label for="dateToady">Added On :: </label>
                        <label class="accordion-body" id="dateToady">${dateToday}</label>
                    </div>
                    <div class="accordion-item row-cols-3 text-center">
                        <input class="accordion-body btn-primary" name="submit" type="submit" value="Submit">
                        <input class="accordion-body btn-danger" name="cancel" type="submit" value="Cancel">
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="row text-center">
        <div class="col-md-4 offset-md-4">
            <div class="bg-light mt-4 mb-2">
                <h3>Spring Boot Project</h3>
            </div>
        </div>
    </div>
</div>
</body>

</html>
