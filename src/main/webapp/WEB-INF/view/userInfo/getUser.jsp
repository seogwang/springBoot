<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>유저 상세 내용</h2>
    <table>
        <tr>
            <th>아이디</th>
            <td>${user.id }</td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td>${user.pw }</td>
        </tr>
        <tr>
            <th>이름</th>
            <td>${user.name }</td>
        </tr>
        <tr>
            <th>이메일</th>
            <td>${user.email }</td>
        </tr>
        <tr>
            <th>전화번호</th>
            <td>${user.tel }</td>
        </tr>
        <tr>
            <th>가입일</th>
            <td>${user.regdate }</td>
        </tr>
        <tr>
            <th>포인트</th>
            <td>${user.point }</td>
        </tr>
        <tr>
            <th>활성화 상태</th>
            <td>${user.act }</td>
        </tr>
        <tr>
            <th>회원 등급</th>
            <td>${user.lev }</td>
        </tr>
    </table>
</body>
</html>
