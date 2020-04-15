import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import Axios from 'axios'
import 'element-ui/lib/theme-chalk/index.css'


import store from './store/index'

router.beforeEach((to, from, next) => {
  const token = store.state.token
  if (to.meta.requireAuth) {
    if (token) { 
      next()
    } else {
      console.log('该页面需要登陆')
      next({
        path: '/login'
      })
    }
  } else {
    next()
  }
})

Axios.defaults.baseURL = 'http://localhost:8888/'
Vue.prototype.$axios = Axios
Vue.config.productionTip = false
Vue.use(ElementUI)

new Vue({
  el: '#app',
  render: h => h(App),
  router,
  store,
  components: { App },
  template: '<App/>'
})

