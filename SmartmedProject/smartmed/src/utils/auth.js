import Cookies from 'js-cookie'

const TokenKey = 'vue_admin_template_token'

export function getToken() {
  return Cookies.get(TokenKey)
}

export function setToken(token) {
  // 将 token 存储的 localStore 中
  localStorage.setItem("token", token)
  return Cookies.set(TokenKey, token)
}

export function removeToken() {
  // token 进行移除
  localStorage.removeItem("token")
  return Cookies.remove(TokenKey)
}
