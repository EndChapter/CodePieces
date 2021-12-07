                                      const state = {
    counter: 0,
}
const getters = {
    getDoubleCounter(state){
        return state.counter *2;
    },
    getStringCounter(state){
        return state.counter + ".kez Tıklandı";
    },
}
const mutations = {
        increaseCounter(state){
            state.counter++;
        },
        decreaseCounter(state){
            state.counter--;
        },
    }
const actions = {
    increment({commit}){
        commit('increaseCounter')
    },
    decrement({commit}){
        commit('decreaseCounter')
    },
    incrementAsync({commit}, timeout){
        setTimeout(()=>{
            commit('increaseCounter')
        }, timeout)
    },
    decrementAsync({commit}, timeout){
        setTimeout(()=>{
            commit('decreaseCounter')
        }, timeout)
    },
}
export default {
    state,
    getters,
    mutations,
    actions
}
