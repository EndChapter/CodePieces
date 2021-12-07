import Vue from 'vue'
import Vuex from 'vuex'
import VueResource from 'vue-resource'


Vue.use(Vuex)
Vue.use(VueResource)
Vue.http.options.root= "https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/"

export default new Vuex.Store({
  state: {
    products: [],
  },
  getters:{
    getProducts(state){
      return state.products;
    },
  },
  mutations: {
    setProducts(state, payload, key){

      state.products.push(payload, key);
    },
    resetProducts(state){
      state.products= []
    }
  },
  actions: {
    getDBProds(context){
      context.commit('resetProducts');
      Vue.http.get('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', '')
          .then(response=>{

              let key;
              for(key in response.data){
                console.log(response.data[key])
                if(Object.prototype.hasOwnProperty.call(response.body, key))
                  context.commit('setProducts', response.body[key], key);
              }

          })
    },
    setDBProds(context, payload){
      Vue.http.post('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', payload)
          .then(()=>{console.log('post succeed')}, ()=>{console.log('post not succeed')})
    },
    // updateDBProds(context, payload){
    //   Vue.http.update()
    // }
  },
  modules: {

  }
})
