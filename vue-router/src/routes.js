import Home from "./components/Home";
import Header from "./components/Header";
import User from "./components/user/User";

function lazyload(view) {
    return () => import(`./components/user/${view}.vue`)
}

export const routes = [
    {
        path: '',
        name: 'anasayfa',
        components:{
        default: Home,
            'header-top': Header
        }
    },
    {
        path: '/user',
        components: {
            default:  User,
                'header-top': Header
            }, children : [
                {
                    path: '',
                    name: 'UserStart',
                    component: lazyload('UserStart'),

                }, // /user
                {
                    path: ':id',
                    component: lazyload('UserDetail'),
                    beforeEnter: (to, from, next)=>{
                    next()
                    }}, // /user/12
                {
                    path: ':id/edit',
                    component: lazyload('UserEdit'),
                    name: 'userEdit'}, // /user/12/edit
            ]
    },
    {
        path: '/redirect',
        redirect: '/user'
    },
    {
        path: '*',
        redirect: '/'
    }
]
// const UserStart = resolve =>{
//     require.ensure([], ()=>{
//         resolve(require('./components/user/UserStart.Vue'))
//     })
// }
// const UserDetail = resolve =>{
//     require.ensure([], ()=>{
//         resolve(require('./components/user/UserDetail.Vue'))
//     })
// }
// const UserEdit = resolve =>{
//     require.ensure([], ()=>{
//         resolve(require('./components/user/UserEdit.Vue'))
//     })
// }
