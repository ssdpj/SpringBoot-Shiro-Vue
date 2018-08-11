import Vue from 'vue'
import Router from 'vue-router'
// in development env not use Lazy Loading,because Lazy Loading too many pages will cause webpack hot update too slow.so only in production use Lazy Loading
/* layout */
import Layout from '../views/layout/Layout'

const _import = require('./_import_' + process.env.NODE_ENV)
Vue.use(Router)
export const constantRouterMap = [
  {path: '/login', component: _import('login/index'), hidden: true},
  {path: '/404', component: _import('404'), hidden: true},
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    name: 'dashboard',
    children: [{
      path: 'dashboard', component: _import('dashboard/index'),
      name: 'dashboard',
      meta: { title: 'dashboard', icon: 'dashboard', noCache: true }
    }]
  }
]
export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
export const asyncRouterMap = [
  {
    path: '/system',
    component: Layout,
    redirect: '/system/article',
    name: 'function_model',
    meta: {title: 'function_model', icon: 'tree'},
    children: [
      {
        path: 'article',
        name: 'article',
        component: _import('article/article'),
        meta: {title: 'article', icon: 'example'},
        menu: 'article'
      },
    ]
  },
  {
    path: '/user',
    component: Layout,
    redirect: '/user/',
    name: 'user_permission',
    meta: {title: 'user_permission', icon: 'table'},
    children: [
      {
        path: '', name: 'user_list', component: _import('user/user'), meta: {title: 'user_list', icon: 'user'}, menu: 'user'
      },
      {
        path: 'role',
        name: 'permission',
        component: _import('user/role'),
        meta: {title: 'permission', icon: 'password'},
        menu: 'role'
      },
    ]
  },
  {path: '*', redirect: '/404', hidden: true}
]
