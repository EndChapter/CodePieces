import Vue from "vue";
import Vuex from 'vuex';
import response from "vue-resource/src/http/response";


Vue.use(Vuex);


export const store = new Vuex.Store({
  state : {
    products : '',
    resp: false,


  },
  getters:{
    getProducts(state){
      let x;
      let prod = [];
      for(x in state.products) {
          prod.push(state.products[x][0])

      }
      return prod;
    }
  },
  mutations:{
    setProducts(state, payload){
      state.products = payload
    },
    setResp(state, payload){
      state.resp = payload
    }

  },
  actions:{
    setFirebaseProducts(context){
      Vue.http.post('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', context.state.products)
        .then(response=>{
          console.log(response)
        },
          response=>{
            console.log(response)
          })
    },
    getFirebaseProducts({commit}, payload){
      Vue.http.get('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', '')
        .then(response=>{
          commit('setProducts', response.data);
          commit('setResp', response.data);

        }, response=>{
          return response;
        })
    },
  }
});
