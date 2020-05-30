import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home/Home.vue'
import CourseDetail from '../views/CourseDetail/CourseDetail.vue'
import Login from '../views/Login/Login.vue'
import Order from '../views/Order/Order.vue'
import Pay from '../views/Pay/Pay.vue'
import Personal from '../views/Personal/Personal.vue'
import Register from '../views/Register/Register.vue'

Vue.use(VueRouter)

const routes = [{
    path: "/",
    name: "Home",
    component: Home
},
    {
        path: "/courseDetail",
        name: "CourseDetail",
        //按需加载
        component: ()=>import("../views/CourseDetail/CourseDetail.vue")
        // component: CourseDetail
    },
    {
        path: "/login",
        name: "Login",
        component: Login
    },
    {
        path: "/order",
        name: "Order",
        component: Order
    },
    {
        path: "/pay",
        name: "Pay",
        component: Pay
    },
    {
        path: "/rersonal",
        name: "Personal",
        component: Personal
    },
    {
        path: "/register",
        name: "Register",
        component: Register
    },
]

const router = new VueRouter({
    routes
})

export default router
