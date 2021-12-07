export const setValueData = ({commit}, payload)=>{
    setTimeout(()=>{
        commit('setValue', payload)
    }, timeout)
}