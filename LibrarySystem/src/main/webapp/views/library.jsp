<%--
  Created by IntelliJ IDEA.
  User: garvitchaudhary
  Date: 16-12-2021
  Time: 05:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Library Page</title>
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">
    <script src="../resources/js/bootstrap.min.js"></script>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
            text-align: center;
            width: 20%;
        }
    </style>
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
            <div class="col col-10">
                <div class="mt-2 p-1 text-center">
                    <h1>Book Listing</h1>
                </div>
            </div>
            <div class="col">
                <div class="mt-2 p-1">
                    <form action="Add">
                        <input class="btn btn-primary w-100" type="submit" value="Add A Book">
                    </form>
                </div>
            </div>
            <table style="width: 98.5%; border-style: dashed; margin-top: 7px; margin-left: 8px;">
                <tr>
                    <th>Book Code</th>
                    <th>Book Name</th>
                    <th>Author</th>
                    <th>Date Added</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="res" items="${resultList}">
                    <tr>
                        <th>${res.bookCode}</th>
                        <th>${res.bookName}</th>
                        <th>${res.bookAuthor}</th>
                        <th>${res.dateAdded}</th>
                        <th>
                            <div class="d-flex justify-content-around">
                                <form action="EditBook" method="POST">
                                    <input type="hidden" name="editCode" value="${res.bookCode}">
                                    <input class="btn btn-primary" style="width:140%" name="submit" type="submit" value="Edit">
                                </form>
                                <form action="RemoveBook" method="POST">
                                    <input type="hidden" name="etBook" value="${res.bookCode}">
                                    <input class="btn btn-danger" name="remove" type="submit" value="Delete">
                                </form>
                            </div>
                        </th>
                    </tr>
                </c:forEach>
            </table>
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
